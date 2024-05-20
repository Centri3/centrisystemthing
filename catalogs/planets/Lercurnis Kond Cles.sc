Planet	"Cles/Lercurnis B VIII"
{
	ParentBody     "Kond"
	Class          "Jupiter"
	Mass            1.17e+03
	Radius          7.8e+04
	InertiaMoment   0.236
	Obliquity       0.41
	EqAscendNode    88.3
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_cles.cfg"
		SurfStyle       0.915
		Randomize      (-1.053, 1.176, 0.795)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
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
		stripeZones     5.5
		stripeFluct     1.02
		stripeTwist     12.9
		cycloneMagn     0
		cycloneFreq     0.275
		cycloneDensity  0.137
		cycloneOctaves  10
		cycloneMagn2     0.378
		cycloneFreq2     0.882
		cycloneLatitude2 0.85
		cycloneOctaves2  0
		BumpHeight      7.16
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Gamma           0.6
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.102
		Velocity        -27
		BumpHeight      4.42
		BumpOffset      0.001
		Gamma           0.4
		Hapke           0.473
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.275
		mainFreq        3
		mainOctaves     15
		Coverage        0.0382
		stripeZones     5.5
		stripeFluct     1.02
		stripeTwist     12.9
	}

	Clouds
	{
		Height          0.102
		Velocity        -366
		BumpHeight      4.42
		Gamma           0.4
		Hapke           0.573
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.748
		mainFreq        3
		mainOctaves     15
		Coverage        0.0382
		stripeZones     5.5
		stripeFluct     1.02
		stripeTwist     12.9
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles"
		Height          500
		Density         1e+04
		Pressure        1e+06
		Bright          5
		Opacity         0.2
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	91.9
			He        	7.78
			CH4       	0.295
			N2        	0.0359
			NH3       	0.0277
			O2        	0.00743
			C2H2      	0.00308
			C2H4      	0.00142
			Ne        	0.00112
			Ar        	0.000842
			C2H6      	0.000588
			C8H18     	0.000348
			C3H8      	0.000328
			H2O       	3.83e-06
			H2S       	1.9e-06
			CO2       	1.54e-06
			Kr        	3.93e-07
			Xe        	4.81e-08
			SO2       	1.13e-08
			CO        	3.67e-10
			Cl2       	3.3e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  10
	}

	Aurora
	{
		Height         1e+03
		NorthLat       90
		NorthLon       0
		NorthRadius    2.69e+04
		NorthWidth     2.69e+04
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 68.8
		NorthMoveSpeed 100
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    2.6e+04
		SouthWidth     3.13e+04
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 68
		SouthMoveSpeed 1.49
		SouthParticles 100000
		TopColor    (1.000 0.000 0.562)
		BottomColor (0.453 0.000 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.705375
		SemiMajorAxis   0.34635328
		Eccentricity    0.02
		Inclination     0.410342822
		AscendingNode   88.3305386
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

