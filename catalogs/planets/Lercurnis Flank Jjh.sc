Moon	"Jjh/Lercurnis III VIII"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.006
	Radius          1.42e+03
	InertiaMoment   0.385
	Obliquity       3
	EqAscendNode    -74.2
	TidalLocked     true

	EndogenousHeating 0
	Albedo          0.28
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_jjh.cfg"
		SurfStyle       0.684
		Randomize      (-0.775, -0.598, 0.250)
		colorDistMagn   0.054
		colorDistFreq   190
		detailScale     64
		drivenDarkening 0
		seaLevel        0.328
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.82
		icecapHeight    0
		climatePole     1
		climateTropic   1
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.394
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       0.336
		venusMagn       0.763
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.0992
		erosion         0.359
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       3
		dunesFreq       0.3
		dunesFraction   1
		hillsMagn       3
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      4
		riversFreq      3
		riversSin       7
		riftsMagn       1
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0.1
		canyonsFreq     125
		canyonsFraction 1
		cracksMagn      0.1
		cracksFreq      0.8
		cracksOctaves   0
		craterMagn      2
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.33
		volcanoFreq     1.57
		volcanoDensity  0.351
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeTwist     0.39
		cycloneMagn     2.88
		cycloneFreq     0.953
		cycloneDensity  0.247
		cycloneOctaves  0
		BumpHeight      25
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          16.9
		Velocity        30
		BumpHeight      2.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  0.1
		Opacity         0.214
		mainFreq        0.527
		mainOctaves     0
		Coverage        0.809
		stripeZones     0
		stripeTwist     0.39
	}

	Clouds
	{
		Height          16.9
		Velocity        40
		BumpHeight      3.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  0.1
		Opacity         0.0916
		mainFreq        0.527
		mainOctaves     0
		Coverage        0.809
		stripeZones     0
		stripeTwist     0.39
	}

	Clouds
	{
		Height          16.9
		Velocity        50
		BumpHeight      4.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  0.1
		Opacity         0.137
		mainFreq        0.527
		mainOctaves     0
		Coverage        0.809
		stripeZones     0
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank Jjh"
		Height          85
		Density         3.93
		Pressure        0.03
		Greenhouse      0.000144
		Bright          5
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			CH4       	90
			N2        	10
			He        	0.0001
			CO        	9e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         1
		NorthLat       90
		NorthLon       0
		NorthRadius    1.5e+03
		NorthWidth     1.5e+03
		NorthRings     10
		NorthBright    0.4
		NorthFlashFreq 8.24
		NorthMoveSpeed 6.44
		NorthParticles 16000
		SouthLat       -90
		SouthLon       180
		SouthRadius    1.5e+03
		SouthWidth     1.5e+03
		SouthRings     10
		SouthBright    0.1
		SouthFlashFreq 1
		SouthMoveSpeed 3.19
		SouthParticles 6000
		TopColor    (0.242 1.000 0.000)
		BottomColor (0.078 0.000 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      60.3379952
		SemiMajorAxisKm 1301088.06
		Eccentricity    0.0763358779
		Inclination     3
		AscendingNode   -74.1984733
		ArgOfPericenter -68.7022901
		MeanAnomaly     -244.580153
	}
}

