Planet	"Clulesc/Externia b"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Neptune"
	Mass            50
	Radius          2.78e+04
	InertiaMoment   0.196
	Oblateness      0.0377
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "externia_clulesc.cfg"
		SurfStyle       0.161
		Randomize      (0.059, 0.889, 0.840)
		detailScale     256
		tropicLatitude  0.573
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
		stripeZones     1.3
		stripeFluct     1.51
		stripeTwist     8.39
		cycloneMagn     20
		cycloneFreq     0.443
		cycloneDensity  0.206
		cycloneOctaves  10
		cycloneMagn2     0.49
		cycloneFreq2     0.858
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      12.3
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
		Height          0.0996
		Velocity        296
		BumpHeight      4.38
		Gamma           0.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.26
		mainFreq        2.29
		mainOctaves     15
		Coverage        0.0644
		stripeZones     1.3
		stripeFluct     1.51
		stripeTwist     8.39
	}

	Clouds
	{
		Height          0.0996
		Velocity        -441
		BumpHeight      14.4
		Gamma           0.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  2
		mainFreq        2.29
		mainOctaves     15
		Coverage        0.0644
		stripeZones     1.3
		stripeFluct     1.51
		stripeTwist     8.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia Clulesc"
		Height          300
		Density         1e+04
		Pressure        1e+06
		Bright          3
		Opacity         0.5
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.4
			He        	7.22
			CH4       	0.294
			N2        	0.0298
			NH3       	0.0247
			O2        	0.00626
			C2H2      	0.00317
			C2H4      	0.00133
			Ne        	0.000881
			Ar        	0.000833
			C2H6      	0.000521
			C3H8      	0.000288
			C8H18     	0.000287
			H2O       	3.16e-06
			H2S       	1.55e-06
			CO2       	1.29e-06
			Kr        	3.21e-07
			Xe        	4.04e-08
			SO2       	8.63e-09
			Cl2       	3.22e-10
			CO        	2.94e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  10
	}

	Aurora
	{
		Height         300
		NorthLat       90
		NorthLon       0
		NorthRadius    1.19e+04
		NorthWidth     2.45e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 58.7
		NorthMoveSpeed 0.656
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    1.19e+04
		SouthWidth     2.45e+03
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 68.7
		SouthMoveSpeed 1.06
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0121116736
		SemiMajorAxis   0.0097632912
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

