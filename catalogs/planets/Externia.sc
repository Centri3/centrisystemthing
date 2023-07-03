Planet	"Externia/Externia a"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Jupiter"
	Mass            2062.3
	Radius          75058
	InertiaMoment   0.2318
	Oblateness      0.014901
	RotationPeriod  8.4759
	RotationEpoch   1451545
	Obliquity       -2.7481
	EqAscendNode    -3.3868
    TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "externia.cfg"
		SurfStyle       0.19536
		Randomize      (0.076, 1.084, 0.290)
		detailScale     256
		tropicLatitude  0.61901
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
		stripeZones     0.68702
		stripeFluct     0.35115
		stripeTwist     14.336
		cycloneMagn     11.992
		cycloneFreq     0.6085
		cycloneDensity  0.50659
		cycloneOctaves  0
		cycloneMagn2     0.3471
		cycloneFreq2     0.83091
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      5.1886
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.97721
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.10156
		Velocity        296.19
		BumpHeight      4.7406
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.41221
		mainFreq        3
		mainOctaves     12
		Coverage        0.10333
		stripeZones     0.68702
		stripeFluct     0.35115
		stripeTwist     14.336
	}

	Clouds
	{
		Height          0.10156
		Velocity        -441.25
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1.5
		mainFreq        3
		mainOctaves     12
		Coverage        0.10333
		stripeZones     0.68702
		stripeFluct     0.35115
		stripeTwist     14.336
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia"
		Height          853.69
		Density         10000
		Pressure        1e+06
		Bright          3
		Opacity         0.5
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	93.521
			He        	6.1459
			CH4       	0.26453
			N2        	0.032412
			NH3       	0.02239
			O2        	0.0065672
			C2H2      	0.0028453
			C2H4      	0.0013323
			Ne        	0.00094896
			Ar        	0.00086504
			C2H6      	0.0006135
			C8H18     	0.00032766
			C3H8      	0.00027432
			H2O       	2.8892e-06
			H2S       	1.5426e-06
			CO2       	1.528e-06
			Kr        	3.7004e-07
			Xe        	4.1958e-08
			SO2       	9.666e-09
			Cl2       	2.9143e-10
			CO        	2.8973e-10
		}
	}

	Aurora
	{
		Height         18.75
		NorthLat       82.962
		NorthLon       -30.831
		NorthRadius    22235
		NorthWidth     8820.6
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 70.174
		NorthMoveSpeed 1.1552
		NorthParticles 10000
		SouthLat       -83.25
		SouthLon       148.03
		SouthRadius    24992
		SouthWidth     11566
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 60.371
		SouthMoveSpeed 0.94773
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
		Period          0.0121116736
		SemiMajorAxis   0.000236708801
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

