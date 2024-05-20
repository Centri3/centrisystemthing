Planet	"Dro/Caecus IV"
{
	ParentBody     "Oblitus es"
	Class          "Jupiter"
	Mass            95.2
	Radius          5.97e+04
	InertiaMoment   0.223
	Oblateness      0.0776
	RotationPeriod  12.1
	RotationEpoch   0
	Obliquity       -76.8
	EqAscendNode    69.3

	EndogenousHeating 0
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_frigid_default.cfg"
		SurfStyle       0.487
		Randomize      (-0.068, -0.491, -0.709)
		detailScale     256
		tropicLatitude  0.976
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.93
		stripeFluct     0.412
		stripeTwist     10.5
		cycloneMagn     13.1
		cycloneFreq     0.896
		cycloneDensity  0.524
		cycloneOctaves  5
		cycloneMagn2     0.336
		cycloneFreq2     0.795
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      19.2
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          27.3
		Velocity        1.03e+03
		BumpHeight      4.04
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.707
		mainOctaves     12
		Coverage        0.114
		stripeZones     3.93
		stripeFluct     0.412
		stripeTwist     10.5
	}

	Clouds
	{
		Height          27.3
		Velocity        2.64e+03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.707
		mainOctaves     12
		Coverage        0.114
		stripeZones     3.93
		stripeFluct     0.412
		stripeTwist     10.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          100
		Density         0.0417
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	89
			He        	6.79
			CH4       	2.84
			C3H8      	0.38
			C8H18     	0.371
			C2H2      	0.317
			C2H4      	0.145
			C2H6      	0.0595
			N2        	0.0355
			NH3       	0.0277
			O2        	0.00772
			Ne        	0.00127
			Ar        	0.000971
			CO2       	0.000181
			H2S       	1.66e-06
			Kr        	4.31e-07
			H2O       	3.44e-07
			Xe        	3.98e-08
			CO        	3.75e-08
			SO2       	9.39e-09
			Cl2       	3.41e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  221
	}

	Aurora
	{
		Height         140
		NorthLat       83.7
		NorthLon       64.3
		NorthRadius    2.1e+04
		NorthWidth     8.58e+03
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 68.3
		NorthMoveSpeed 0.618
		NorthParticles 10000
		SouthLat       -82.2
		SouthLon       -116
		SouthRadius    1.52e+04
		SouthWidth     7.54e+03
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 74.2
		SouthMoveSpeed 0.764
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          96.5675527
		SemiMajorAxis   17.24844
		Eccentricity    0.106870229
		Inclination     3
		AscendingNode   -46.7175573
		ArgOfPericenter 74.1984733
		MeanAnomaly     41.221374
	}
}

